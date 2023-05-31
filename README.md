# byte-buddy-jacoco
It's a easy sample to use byte-buddy and jacoco.

When I use JDK 17, I found a problem for jacoco, I delete jacoco in build.gradle.

![Screenshot 2023-05-31 at 17 48 29](https://github.com/nevermore18/byte-buddy-jacoco/assets/52122656/a12f8f49-cd2f-4bf8-8834-bc1ba9037af3)

And I run the test, it can run well.

![Screenshot 2023-05-31 at 17 52 42](https://github.com/nevermore18/byte-buddy-jacoco/assets/52122656/cc2c982b-1eaf-4cb0-9c3d-7664290058cf)

But When I use jacoco, I found byte-buddy throw exception as below. 

When I use JDK 11 and whether or not to use jacoco, it can run well, so I think there is something wrong with jacoco in JDK 17.

![Screenshot 2023-05-31 at 17 54 46](https://github.com/nevermore18/byte-buddy-jacoco/assets/52122656/7d206f77-18db-4112-9dc9-83eb18667329)


