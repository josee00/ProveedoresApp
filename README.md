# ProveedoresApp
App Proveedores
## Importar en un IDE
1. Clona el repositorio del proyecto.
2. Abre tu IDE (se recomienda Eclipse).
3. Importa el proyecto Maven seleccionando `File > Import > Maven > Existing Maven Projects`.
4. Selecciona la carpeta raíz del proyecto y haz clic en "Finish".

## Configuración de la base de datos
1. Abre MySQL Workbench o tu cliente de base de datos.
2. Ejecuta el script `script.sql` incluido en el proyecto para crear la base de datos y las tablas necesarias.

## Importar colección de Postman
1. Abre Postman.
2. Importa la colección de solicitudes incluida en el proyecto.

## Ejecutar colección de Postman
2. Abre la colección de Postman importada.
3. Haz clic en el botón "Run" para ejecutar todas las solicitudes.
4. Verifica que todas las solicitudes se ejecuten correctamente y devuelvan las respuestas esperadas.

## Configuración del archivo application.properties
1. Abre el archivo `application.properties` ubicado en la carpeta `src/main/resources`.
2. Verifica que la configuración de la base de datos (`spring.datasource.url`, `spring.datasource.username`, `spring.datasource.password`) sea correcta, ya que dependerá de tu cliente de base de datos.
