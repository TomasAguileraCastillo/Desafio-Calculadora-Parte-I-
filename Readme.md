Desafío - Calculadora (Parte I)
--

- En este desafío validaremos nuestros conocimientos vistos en las sesiones anteriores.
Lee todo el documento antes de comenzar el desarrollo individual o grupal, para asegurarte
de tener el máximo de puntaje y enfocar bien los esfuerzos.


Descripción
-

- Durante una fiesta, luego de haber comido pizza toda la tarde, tu amigo pregunta si se
compartirán los gastos en forma igualitaria. Como ya era muy tarde y nadie tenía carga en su
celular, encontraron como solución usar el pc del dueño del departamento, que justamente
tenía abierto Eclipse. Por lo que decides poner en práctica todo lo aprendido durante el último
tiempo.


- Para lograr el objetivo debes realizar una calculadora que posea operaciones elementales
como “sumar”, “restar”, “multiplicar” y “dividir”, todo esto con la finalidad de calcular los
montos. Las características que debe tener la calculadora se detallan a continuación: 


Requerimientos
-

1. Crear un nuevo proyecto con Maven.
   (2 Puntos)
2. Agregar las dependencias de JUnit 4.
   (2 Puntos)
3. Crear clase Calculadora, con los métodos “restar”, “sumar”, “multiplicar” y “dividir”.
   (2 Puntos)
4. Crear clase de prueba CalculadoraTest con los métodos de prueba para comprobar si
   se puede “sumar”, “restar”, “multiplicar” y “dividir”.
   (2 Puntos)
5. Ejecutar salida de mvn test.
   (2 Puntos)

- Formato de salida:

Para mostrar el resultado de las pruebas se debe escribir afirmaciones que validen los
datos ingresados. Se debe ejecutar Maven test y su salida debe ser BUILD SUCCESS similar
a:

    [INFO] -------------------------------------------------------
    [INFO] T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running cl.desafiolatam.CalculadoraTest
    [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.03 s - in
    cl.desafiolatam.CalculadoraTest
    [INFO]
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 2.151 s
    [INFO] Finished at: 2019-07-07T13:16:19-04:00
    [INFO] ------------------------------------------------------------------------


Imagen del Resultado

![img.png](Imagen%20del%20proyecto%2Fimg.png)

![img_1.png](Imagen%20del%20proyecto%2Fimg_1.png)