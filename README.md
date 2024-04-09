# Sistema para gestion de permisos municipales:

# Clases:

GestionMunicipal: Es la clase encargada de gestionar la municipalidad y los permisos.

Ciudadano: Es la clase que representa un ciudadano que solicita los permisos. Es agregación de Municipalidad pues esta última agrega los permisos necesarios para los ciudadanos.

Municipalidad: Esta clase es la que conecta los Ciudadanos con la GestionMunicipal puesto que los ciudadanos no tienen acceso a ella. Municipalidad también es la que agrega permisos que piden/solicitan los ciudadanos.

Permiso: Es una clase abstracta, que tiene como cadena de herencia 3 clases hijas, las cuales son: Negocio, Construccion y EventoEspecial que son los permisos en sus diferentes categorías.
También tiene un método abstracto que llamado costoPermiso, que calculará en sus clases hijas el costo del determinado permiso.
Los atributos que posee son protegidos y son: fechaEmision, fechaVencimiento, id, costo.

Negocio: Es una clase hija de Permiso, es la encargada de los permisos de negocios y entre sus atributos propios podemos nombrar: tipoNegocio, tamanioLocal, cantEmpleados.
Esto claro más los atributos de la clase padre.

Construccion: Es una clase hija de Permiso, es la encargada de los permisos de construccion y entre sus atributos propios podemos nombrar: tipoConstruccion, m2AConstruir, ubicacion.
Esto claro más los atributos de la clase padre.

EventoEspecial: Es una clase hija de Permiso, es la encargada de los permisos de eventos especiales y entre sus atributos propios podemos nombrar: tipoEvento, cantEsperada, mSeguridad.
Esto claro más los atributos de la clase padre.

# UML:

![PERMISOSPNG](https://github.com/millrnv/GestionPermisos/assets/146766468/cca92afb-7e24-4182-a574-a5f51bc47e71)

