# SwAT Minecraft Plugin (Kotlin)

Minecraft plugins are a great way to get one's feet wet with programming in codebases with dependencies and external libraries!

It's also a great way to rapidly prototype your game ideas.


> mc version: 1.21.11

## Quickstart

For mc development, we recommend using the IDE IntelliJ.

You *may* need to download an SDK (Software Development Kit) - we are using JDK 21. You can download this [here](https://www.oracle.com/java/technologies/downloads/#java21)

(or in IntelliJ: gear icon > project structure > SDK (or, ctrl+alt+shift+S))

Gradle is a build tool for Java and Kotlin. (A distribution of gradle comes with IntelliJ)
Meaning it can handle project dependency configurations and build (compile, link) your project.

It can also run other tasks, such as

```shell
./gradlew runServer
```

Which will start a paper server on your machine to which you can connect from your mc client.

> Note: on the first run, a `eula.txt` will be generated and you must agree to the 
> eula by setting `eula=false` -> `eula=true` (eula = end user licence agreement)
> 
> After setting this to true, run the command again and the server should start up 
> (faster this time, since the gradle daemon is up and running).
>
> @solace TODO: make this automatic on first runs. 


---

That's all for now! If you have an idea for a feature or system you want in-game, please make an issue in the repo!

