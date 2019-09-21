# Java Web开发起步练习项目
## 涉及到的知识点：
- Servlet的层级，实现方式
- request取请求参数
- 请求乱码的处理
- 服务器端跳转、传参
- response的使用
- 响应乱码的处理
- 客户端跳转、传参
- session的概念和用法
- cookie的概念和用法
- 采用合理的布局和样式、图标等优化页面

## 1.登录起步练习
- login.html输入用户名和密码
![Snipaste_2019-09-21_15-29-21.png](http://ww1.sinaimg.cn/large/0067OQVXgy1g776sqw7x3j30fo0710tg.jpg)
- LoginServlet拦截/login.do请求，取得参数，判定是否和指定值相等，相等就将用户名存入session，然后重定向到index.jsp主页
- 主页通过jsp表达式<%= %>，用session内置对象取出用户名显示
![Snipaste_2019-09-21_15-29-33.png](http://ww1.sinaimg.cn/large/0067OQVXgy1g776t6ordzj30e505r3z3.jpg)

## 2.服务端转发数据至目标页面渲染
- Student实体类，封装基础属性
- StudentServlet，拦截/students请求，创建一个集合存入若干Student对象，存入request，并通过服务器转发（地址栏不变）将request带到student.jsp页面
- student.jsp页面用request内置对象取出数据，并借助页面内置对象和EL表达式,遍历数据集合，在页面上显示
![学生信息显示.jpg](http://ww1.sinaimg.cn/large/0067OQVXgy1g776q0du7qj31gu0lj40t.jpg)

## 3.登录案例进阶
- 未登录用户可以在首页浏览所有后台返回的图书信息
![未登录用户](http://ww1.sinaimg.cn/large/0067OQVXgy1g7764w9p66j31hc0scgsg.jpg)

- 点击"去登录"可以跳转到登录页，输入账号和密码，进后台匹配
![登录页面](http://ww1.sinaimg.cn/large/0067OQVXgy1g775zmzwrkj31hc0scju3.jpg)

- 登录成功跳回首页，顶部显示用户头像
![登录成功](http://ww1.sinaimg.cn/large/0067OQVXgy1g775znfwwaj31hc0sc7b6.jpg)

- 点击用户头像可以进入用户个人信息页面，少量信息为后台动态数据，其余是为了填充页面写的静态页面
![个人中心](http://ww1.sinaimg.cn/large/0067OQVXgy1g7765jbrixj31hc0scn13.jpg)
