# trash-wagon
An autonomous vehicle to hold and then weekly deliver trash to the curb.

# MOTOR TEST BRANCH

## SET UP
```
$ ls ~/lib/linux/raspbian/shared/
libCTRE_PhoenixCanutils.so  libCTRE_PhoenixCCI.so  libCTRE_PhoenixPlatform.so  libCTRE_PhoenixPlatform_socketcan.so
```

```
$ sudo ip link set can0 type can bitrate 500000
$ sudo ifconfig can0 txqueuelen 1000
$ sudo ifconfig can0 up
```

## COMPILE
```
$ export LD_PRELOAD=/home/pi/lib/linux/raspbian/shared/libCTRE_PhoenixPlatform.so:/home/pi/lib/linux/raspbian/shared/libCTRE_PhoenixCanutils.so
$ javac -cp ~/lib/api-java-5.14.1.jar Robot.java
$ java -cp .:/home/pi/lib/api-java-5.14.1.jar -Djava.library.path=/home/pi/lib/linux/raspbian/shared Robot
```

