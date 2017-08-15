# mybits

http://blog.csdn.net/mm22656676/article/details/47299677

# 多库配置spring-mybatis.xml

# 配置两个数据源一个读一个写，并且配置动态数据源进行指定，并且编写两个处理类。

DBContextHolder
DynamicDataSource

# service层进行动态指定数据源

public List<UserInfo> getUser(){
  DBContextHolder.setDbType(DBContextHolder.DB_TYPE_R);
  return userInfoMapper.selectAll();
}
  
public int createUser(UserInfo userInfo){
  DBContextHolder.setDbType(DBContextHolder.DB_TYPE_RW);
  return userInfoMapper.insert(userInfo);
}
