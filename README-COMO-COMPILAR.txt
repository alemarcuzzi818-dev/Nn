=============================================================
 NIGHTFALL STALKER - Mod para Minecraft 1.16.5 (Forge)
=============================================================

QUE INCLUYE ESTE MOD
--------------------
- Mob hostil "Nightfall Stalker" (violeta, ojos brillantes)
- 30 HP, ataque 6, velocidad alta, spawnea de noche
- Spawn egg (grupo "Miscelaneo" del inventario creativo)
- Dropea: membrana fantasmal / perla de ender / hueso
- Sonidos de fantasma, mas empuje al golpear de noche

REQUISITOS PARA COMPILAR
------------------------
1. Java JDK 8 (NO uses Java 17 para compilar 1.16.5)
   - Descarga: https://adoptium.net/temurin/releases/?version=8
2. Conexion a internet (la primera vez descarga Forge y mappings)

COMO COMPILAR (PASO A PASO)
---------------------------
1. Descomprime esta carpeta en algun lado (ej: Escritorio)

2. Abre una terminal / cmd dentro de la carpeta

3. Windows:
      gradlew.bat build
   Linux / Mac:
      ./gradlew build

   (La primera vez tarda 10-30 minutos, es normal)

4. Cuando termine, el JAR listo para jugar esta en:
      build/libs/nightfallstalker-1.0.0.jar

5. Copia ese JAR a la carpeta mods/ de tu Minecraft 1.16.5
   con Forge 36.x instalado. BORRA el nightfallstalker
   viejo/ vacio que causaba el error.

6. Abre el juego. Ya no veras el warning de
   "is not a valid mod file".

PROBAR EN DESARROLLO
--------------------
   gradlew.bat runClient   (abre Minecraft con el mod cargado)

ERRORES COMUNES
---------------
- "Unsupported class file major version": tu JAVA_HOME apunta
  a Java 17. Configura JAVA_HOME al JDK 8.
- Si no existe gradlew: instala Gradle o usa el "Forge MDK"
  1.16.5 y copia los archivos gradlew/gradle/ de ahi.
