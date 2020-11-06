@echo off
set DataSource=DB2DS
set NodeName=BLR2UBLP070Node17
set processName=server1

set _my_datetime=%date%_%time%
set _my_datetime=%_my_datetime: =_%
set _my_datetime=%_my_datetime::=%
set _my_datetime=%_my_datetime:/=_%
set _my_datetime=%_my_datetime:.=_%

echo on
wsadmin -c "$AdminControl invoke [$AdminControl queryNames "*:name=%DataSource%,process=%processName%,node=%NodeName%,j2eeType=JDBCDataSource,*"] showPoolContents" >> ../logs/server1/pool_contents%_my_datetime%.log


