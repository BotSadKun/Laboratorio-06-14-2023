# Laboratorio-06-14-2023
Laboratorio # 4 - Herencia y Polimorfismo

Objetivo de aprendizaje Al finalizar este ejercicio, el estudiante tendrá la capacidad 
para definir una jerarquía de herencia con clases abstractas.

Jerarquía de clases de animales Se tiene una jerarquía taxonómica con los siguientes 
animales: 
Animal es la clase raíz con los atributos: sonidos, alimentos, hábitat y nombre científico 
(todos de tipo String). 
Esta clase tiene los siguientes métodos abstractos: 
  o public abstract String getNombreCientífico() 
  o public abstract String getSonido() 
  o public abstract String getAlimentos() 
  o public abstract String getHábitat() 

Los cánidos y los felinos son subclases de Animal. 

Los perros son cánidos, su sonido es el ladrido, su alimentación es carnívora, su hábitat 
es doméstico y su nombre científico es Canis lupus familiaris. 

Los lobos son cánidos, su sonido es el aullido, su alimentación es carnívora, su hábitat 
es el bosque y su nombre científico es Canis lupus. 

Los leones son felinos, su sonido es el rugido, su alimentación es carnívora, su hábitat 
es la pradera y su nombre científico es Panthera leo. 

Los gatos son felinos, su sonido es el maullido, su alimentación son los ratones, su 
hábitat es doméstico y su nombre científico es Felis silvestris catus. 

Además, se requiere en una clase de prueba para desarrollar un método main que 
genere un array de animales y la pantalla debe mostrar los valores de sus atributos. 

1. Construya El diagrama de clases UML define una jerarquía de clases donde la 
clase abstracta Animal es la raíz de la jerarquía y es una clase abstracta que se 
identifica en UML colocando el nombre de la clase en cursiva. 

2. Desarrolle el Programa en Java, implementando las abstracciones donde 
aplíquenle proyecto, así como los conceptos de herencia y polimorfismo. 
