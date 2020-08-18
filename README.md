# jax-ws-client-test

Hi this is a sample client project about soap server project. You just download this project then generate the wsdl by using wsimport.(in eclipse)
For generate the codes we go in run->External Tools->External Tools Configuration-> we choose program and click + on top of list.on the right window you will see location,working directory and arguments.

-Location is for your wsimport.Click the browse file system and find your wsimport file in jdk or another file path.
(eg. /Library/Java/JavaVirtualMachines/jdk1.8.0_172.jdk/Contents/Home/bin/wsimport)

-Working directory is your project path. You can click the browse file system and choose your project.

-in arguments you write this code(You keep that your wsdl address can be different.) . -keep -verbose http://localhost:8091/fighterservice?wsdl
.
.
.
Now you will see on your console Generating code...
.
.
.
Refresh your project and you can see your generated classes from wsimport. Now you can use that classes for client requests.

If you have a problem about code or something, please write me.

Thank you..


