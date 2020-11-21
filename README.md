DerIntCal

    "DerIntCal" significa "Derivative and Integral Calculator"
    (Calculadora de derivadas e integrales).

Integrantes

    Juan Pablo Ángel Parra Arévalo
    Dylan Steven Romero Romero
    Daniel Santiago Valderrama Álvarez

Clonar el repositorio:

    git clone https://github.com/jpparraa/DerIntCal.git

    cd DerIntCal

Compliar

    javac -cp xchart-3.6.5.jar:. *.java
    
Ejecutar

    java -cp xchart-3.6.5.jar:. DerIntCal

Uso:

    El programa muestra mediante una terminal 10 funciones con un número asignado.
    El usuario elige un número.

    El programa imprime el valor de la derivada y de la integral.
    El programa genera el gráfico de la función, por medio de una ventana.

Explicación del código:

    En la clase DerIntCal se encuentra el menú principal y la creación de los gráficos.
    Para hallar la derivada, se llama a la clase Derivative, que calcula la deriva mediante la formula: (f(x+h)-f(x))/h
    Para hallar la integral, se llama a la clase Integral, que calcula la integral entre a y b utilizando la regla del trapecio.
    Adicionalmente, la explicación de la regla del trapecio se encuentra en el siguiente enlace: https://www.youtube.com/watch?v=MQ-Yk3IpHz4 (Gracias, ennraii).
    Para graficar las funciones se utilizó la librería XChart, Disponible en: https://github.com/knowm/XChart

Ejemplos:

![alt text](https://github.com/jpparraa/DerIntCal/blob/master/etc/f1.png)
![alt text](https://github.com/jpparraa/DerIntCal/blob/master/etc/f10.png)
