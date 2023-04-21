Scalajs.Vite
------------
>ScalaJs-Vite feature tests.

Note
----
>The Vite following commands currently faile:
1. npm run build ( Could not resolve entry module "index.html" )
2. npm run dev ( No webpage was found for the web address: http://localhost:5173/ )
>Vite, the successor to Snowpack, is disappointing. Stay with what works for now.

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
1. sbt clean test fullLinkJS
2. npm run build
>See **dist** directory.

Console
-------
1. sbt clean compile fastLinkJS run

Browser
-------
1. sbt clean compile fastLinkJS
2. npm run dev