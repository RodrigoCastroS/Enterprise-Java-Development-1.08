# Enterprise-Java-Development-1.08
Lab 1.08 Ironhack


CORRECCIÓN Y MEJORAS
- El método negate de BigDecimal convierte de positivo a negativo y viceversa, por lo que te podrías ahorrar el segunto if.
- Si declaras una constante para una clase, debería tener las propiedades *public static final*, pero al ser común para todos los IntList, podrías declararla en la interfaz (sin tener que indicar esas propiedades, ya que todos los atributos de una interfaz son estáticos y finales).
- Te falta indicar la diferencia entre un IntVector y un IntArrayList!
- Por lo demás, un código muy limpio y eficiente, sigue así!
