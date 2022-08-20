### Cuando usar IntVector e IntArrayList
 
### – IntArrayList
Generalmente esta va a ser la mejor solución a usar cuando no sepas cuanto crecerá el array, por lo que crecerá exponencialmente
segùn lo necesites. Al tener un tamaño más acotado, la performance de bùsqueda del array será más rapida, al igual que si se
quisiera manipular.

### – IntVector
En este caso, se podría utilizar cuando se supiera la cantidad (más o menos) de datos que se añadirían al array. Por qué? Porque
una vez llegado al límite, se duplicará. Por lo que si tuvieras 41 nùmeros guardados en un array, tendrías 80 posiciones en total y 
39 vacías! Entiendo, que por motivos de rendimiento no es lo ideal ya que puedes acabar un un array imenso con posiciones vacías ocupando memoria.
Te imaginas tener un array con 320 posiciones y 159 vacías? No tendría mucho sentido, a no ser que supieras que el nùmero total de posiciones siempre
se eleve al cuadrado.


# Enterprise-Java-Development-1.08

Lab 1.08 Ironhack


CORRECCIÓN Y MEJORAS
- El método negate de BigDecimal convierte de positivo a negativo y viceversa, por lo que te podrías ahorrar el segunto if.
- Si declaras una constante para una clase, debería tener las propiedades *public static final*, pero al ser común para todos los IntList, podrías declararla en la interfaz (sin tener que indicar esas propiedades, ya que todos los atributos de una interfaz son estáticos y finales).
- Te falta indicar la diferencia entre un IntVector y un IntArrayList!
- Por lo demás, un código muy limpio y eficiente, sigue así!
