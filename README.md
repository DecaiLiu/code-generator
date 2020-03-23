# code-generator
mybatis-mysql 代码自动生成工具，支持自定义注释
<br/>下载对应的依赖，配置自己的mysql连接，直接运行StartUp的main方法即可自动生成相应的文件。
<br/>mysql8及以上的 jdbc.driverClass=com.mysql.cj.jdbc.Driver
<br/>mysql8以下的 jdbc.driverClass=com.mysql.jdbc.Driver
<br/>
<br/>如果使用的mysql8以下的版本，需要自行下载并配置驱动包的路径
<br/>
<br/><b>注意：</b>
<br/>如果重复执行StartUp的main方法需要先删除xxxMapper.xml文件，因为这个文件不会被覆盖，而是append。
<br/>
<br/>待实现功能：
<br/>多表同时生成对应文件；
<br/>重复执行程序，覆盖xxxMapper.xml文件；
