# Overview

The chat-systems project is a maven parent project for provide chat functionality in wicket web application projects.

## License

The source code comes under the liberal Apache License V2.0, making chat-systems great for all types of java applications.

# Build status

[![Build Status](https://travis-ci.org/lightblueseas/chat-systems.svg?branch=master)](https://travis-ci.org/lightblueseas/chat-systems)

## Maven Central

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/chat-systems/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/chat-systems)


## Maven projects and install

You can add the following maven dependencies to your project `pom.xml` if you want to import the library. 

You can first define the version properties:

```
<properties>
	...
	<!-- WICKET-CHAT-SYSTEM version -->
	<chat-systems.version>7.6.0</chat-systems.version>
	<wicket-chat-api.version>${chat-systems.version}</wicket-chat-api.version>
	<wicket-channel-chat.version>${chat-systems.version}</wicket-channel-chat.version>
	...
</properties>
```

Add the following maven dependency to your project `pom.xml` if you want to import wicket-chat-api:

```xml
<dependency>
	<groupId>de.alpharogroup</groupId>
	<artifactId>wicket-chat-api</artifactId>
	<version>${wicket-chat-api.version}</version>
</dependency>
```

Add the following maven dependency to your project `pom.xml` if you want to import wicket-channel-chat:

```xml
<dependency>
	<groupId>de.alpharogroup</groupId>
	<artifactId>wicket-channel-chat</artifactId>
	<version>${wicket-channel-chat.version}</version>
</dependency>
```

## Open Issues
[![Open Issues](https://img.shields.io/github/issues/lightblueseas/chat-systems.svg?style=flat)](https://github.com/lightblueseas/chat-systems/issues) 

## Want to Help and improve it? ###

The source code for chat-systems are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [lightblueseas/chat-systems/fork](https://github.com/lightblueseas/chat-systems/fork)

To share your changes, [submit a pull request](https://github.com/lightblueseas/chat-systems/pull/new/master).

## Contacting the Developers

Do not hesitate to contact the chat-systems developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/lightblueseas/chat-systems/issues).

## Note

No animals were harmed in the making of this library.

# Donate

If you like this library, please consider a donation through 
<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Flightblueseas%2Fchat-systems" target="_blank">
<img src="http://button.flattr.com/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0">
</a>
