import java.io.*;
import java.lang.Thread; //Librerías para que funcione el delay

var hor: Int = 0 //Variable para que el usuario establezca las horas a contar
var min: Int = 0 //Variable para que el usuario establezca los minutos a contar
var seg: Int = 0 //Variable para que el usuario establezca los segundos a contar
var hcon: Int = 0 //Variable para contar las horas
var mcon: Int = 0 //Variable para contar los minutos
var scon: Int = 0 //Variable para contar los segundos
var cond: Int = 0 //Variable que sirve de condición al temporizador para ejecutarse

fun temp() //Función para el temporizador
{
    while(cond==0)
    {
        if(scon == 59)
        {
            mcon++
            scon=0
        }
        else
        {
            scon+=1
        }
        if(mcon==59)
        {
            hcon++
            mcon=0
        }
        println("$hcon:$mcon:$scon")
        Thread.sleep(1000)
        if(hcon==hor && mcon==min && scon==seg)
        {
            break
        }
    }
}

fun main() //Función principal
{
    println("Ingrese las horas: ")
    hor = readLine()!!.toInt()
    println("Ingrese los minutos: ")
    min = readLine()!!.toInt()
    println("Ingrese los segundos: ")
    seg = readLine()!!.toInt()
    temp()
    println("El conteo ha terminado. Su tiempo final es $hcon hora(s) con $mcon minuto(s) y $scon segundo(s)")
}