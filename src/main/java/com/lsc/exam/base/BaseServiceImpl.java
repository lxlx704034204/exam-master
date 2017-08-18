package com.lsc.exam.base;

import com.lsc.exam.util.SpringContextUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.mybatis.generator.api.dom.java.Interface;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * 实现BaseService抽象类
 * Created by ZhangShuzheng on 2017/01/07.
 */
public abstract class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record, Example>  {

	public Mapper mapper;
	public void setBaseMapper(Mapper baseMapper) {
		this.mapper = baseMapper;
	}
	public int countByExample(Example example) {
		try {
			Method countByExample = mapper.getClass().getDeclaredMethod("countByExample", example.getClass());
			Object result = countByExample.invoke(mapper, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteByExample(Example example) {
		try {
			Method deleteByExample = mapper.getClass().getDeclaredMethod("deleteByExample", example.getClass());
			Object result = deleteByExample.invoke(mapper, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteByPrimaryKey(Integer id) {
		try {
			Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
			Object result = deleteByPrimaryKey.invoke(mapper, id);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int insert(Record record) {
		try {
			Method insert = mapper.getClass().getDeclaredMethod("insert", record.getClass());
			Object result = insert.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int insertSelective(Record record) {
		try {
			Method insertSelective = mapper.getClass().getDeclaredMethod("insertSelective", record.getClass());
			Object result = insertSelective.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Record> selectByExampleWithBLOBs(Example example) {
		try {
			Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			Object result = selectByExampleWithBLOBs.invoke(mapper, example);
			return (List<Record>) result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Record> selectByExample(Example example) {
		try {
			Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
			Object result = selectByExample.invoke(mapper, example);
			return (List<Record>) result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Record selectFirstByExample(Example example) {
		try {
			System.out.println("----test-1-selectFirstByExample(...)--mapper-: " + mapper); //
//			System.out.println("----test-2-selectFirstByExample(...)--SLAVE.getName()-: " + DataSourceEnum.SLAVE.getName()); //
			System.out.println("----test-3-selectFirstByExample(...)--example.getClass()-: " + example.getClass()); //
			Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
			System.out.println("----test-4-selectFirstByExample(...)--selectByExample-: " + selectByExample); //

			List<Record> result = (List<Record>) selectByExample.invoke(mapper, example);
			if (null != result && result.size() > 0) {
				return result.get(0);
			}
		} catch (InvocationTargetException e) {
			System.out.println("此处接收被调用方法内部未被捕获的异常");
			Throwable t = e.getTargetException();// 获取目标异常
			t.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Record selectFirstByExampleWithBLOBs(Example example) {
		try {
			Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
			List<Record> result = (List<Record>) selectByExampleWithBLOBs.invoke(mapper, example);
			if (null != result && result.size() > 0) {
				return result.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Record selectByPrimaryKey(String id) { //Integer
		try {
			System.out.println("----test-1-selectByPrimaryKey(...)--mapper-: " + mapper); //org.apache.ibatis.binding.MapperProxy@83026cf
			//找到 当前mapper(假设当前是TbUserMapper) 的selectByPrimaryKey方法 及它的参数
			Method selectByPrimaryKey = mapper.getClass().getDeclaredMethod("selectByPrimaryKey", id.getClass());
			System.out.println("----test-2-selectByPrimaryKey(...)--selectByPrimaryKey-: " + selectByPrimaryKey); //
			Object result = selectByPrimaryKey.invoke(mapper, id);
			System.out.println("----test-3-selectByPrimaryKey(...)--result-: " + result); //
			return (Record) result;
		}catch (InvocationTargetException e) {
			System.out.println("此处接收被调用方法内部未被捕获的异常");
			Throwable t = e.getTargetException();// 获取目标异常
			t.printStackTrace();
			System.out.println("----test-4-selectByPrimaryKey(...)--e.getTargetException()-: " + e.getTargetException()); //
		}  catch (Exception e) {
			e.printStackTrace();
			System.out.println("----test-5-selectByPrimaryKey(...)--e.toString()-: " + e.toString()); //
		}
		return null;
	}

	
	public int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example) {
		try {
			Method updateByExampleSelective = mapper.getClass().getDeclaredMethod("updateByExampleSelective", record.getClass(), example.getClass());
			Object result = updateByExampleSelective.invoke(mapper, record, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	 
	public int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example) {
		try {
			Method updateByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("updateByExampleWithBLOBs", record.getClass(), example.getClass());
			Object result = updateByExampleWithBLOBs.invoke(mapper, record, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	 
	public int updateByExample(@Param("record") Record record, @Param("example") Example example) {
		try {
			Method updateByExample = mapper.getClass().getDeclaredMethod("updateByExample", record.getClass(), example.getClass());
			Object result = updateByExample.invoke(mapper, record, example);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	 
	public int updateByPrimaryKeySelective(Record record) {
		try {
			Method updateByPrimaryKeySelective = mapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
			Object result = updateByPrimaryKeySelective.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	 
	public int updateByPrimaryKeyWithBLOBs(Record record) {
		try {
			Method updateByPrimaryKeyWithBLOBs = mapper.getClass().getDeclaredMethod("updateByPrimaryKeyWithBLOBs", record.getClass());
			Object result = updateByPrimaryKeyWithBLOBs.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	 
	public int updateByPrimaryKey(Record record) {
		try {
			Method updateByPrimaryKey = mapper.getClass().getDeclaredMethod("updateByPrimaryKey", record.getClass());
			Object result = updateByPrimaryKey.invoke(mapper, record);
			return Integer.parseInt(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	 
	public int deleteByPrimaryKeys(String ids) {
		try {
			if (StringUtils.isBlank(ids)) {
				return 0;
			}
			String[] idArray = ids.split("-");
			int count = 0;
			for (String idStr : idArray) {
				if (StringUtils.isBlank(idStr)) {
					continue;
				}
				Integer id = Integer.parseInt(idStr);
				Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
				Object result = deleteByPrimaryKey.invoke(mapper, id);
				count += Integer.parseInt(String.valueOf(result));
			}
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	 
//	public void initMapper() {
//		this.mapper = SpringContextUtil.getBean(getMapperClass());
//	}

	/**
	 * 获取类泛型class
	 * @return
	 */
	public Class<Mapper> getMapperClass() {
		return (Class<Mapper>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

}