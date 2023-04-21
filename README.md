Scalajs.Vite
------------
>ScalaJs-Vite feature tests.

Note
----
>Currently Vite npm run build | dev do not work.

Install
-------
1. brew install node
>See **package.json** for installable dependencies.

Vite
----
1. npm install -D @scala-js/vite-plugin-scalajs@1.0.0
>See **package.json**.

Build
-----
1. npm install ( only when package.json changes )
2. sbt clean compile fastLinkJS
>See **target/public** directory.

Test
----
1. sbt clean test fastLinkJS
>See **target/public** directory.

Dev
---
>Edits are reflected in both sessions.
1. sbt ( new session )
2. ~ fastLinkJS
3. npm run dev ( new session )

Package
-------
>TODO! Fails!
1. sbt clean test fullLinkJS
2. npm run build
>See **build** directory.

Console
-------
1. sbt clean compile fastLinkJS run

Browser
-------
>TODO! Fails!
1. sbt clean compile fastLinkJS
2. npm run dev