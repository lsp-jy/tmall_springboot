use mysql;
-- new user
set password for root@localhost = password('admin123456');
-- important
grant all on *.* to root@'%' identified by 'admin123456' with grant option;
-- use privileges
flush privileges;
