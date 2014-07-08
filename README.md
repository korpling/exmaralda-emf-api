exmaralda-emf-api
=================

This project provides an EMF (see: http://www.eclipse.org/modeling/emf/) meta model of the EXMARaLDA (see: http://www.exmaralda.org/) data format (.exb). Further a Java api is included to access, manipulate read and store such data.

maven
===
You can also plug-in this api into your code via maven. 

```xml
<groupId>de.hu_berlin.german.korpling</groupId>
<artifactId>exmaralda-emf-api</artifactId>
<version>VERSION</version>
```

To access the maven coordinates, you need to include our maven repoitory:

```xml
<repositories>
  <repository>
    <id>korpling</id>
    <name>korpling maven repo</name>
    <url>http://korpling.german.hu-berlin.de/maven2</url>
  </repository>
</repositories>
```

contribute
===
Please help us to improve the api by giving us some feedback. If you find any bugs or have some feature requests please open up an issue in github. For contributing, just clone the repository and make a pull request or fork the project.

license
===
  Copyright 2009 Humboldt University of Berlin, INRIA.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
 
  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
