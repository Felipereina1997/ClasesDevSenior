/*
# Verificás en qué rama estás
git branch

# Crear una nueva rama para tu feature
git checkout -b feature/nueva-funcionalidad

# Hacés tus cambios en el código...

# Verifico que archivos han sido modificados con mis update
git status 

# Luego guardás los cambios
git add .
git commit -m "Agrega nueva funcionalidad X"

# Subís la rama nueva al remoto
git push -u origin feature/nueva-funcionalidad

 */

public class Other {
    
    public static void main(String[] args) {
        
        System.out.println("Holita");
        System.out.println("Esto es nuevo luego de cerrar y abrir por X tiempo el proyecto");
        /*Merge como se le dice en ingles es la fusion de ramas que
        consiste en llevar ese features a mi rama principal */
        System.out.println("Esto de aqui es codigo que estara en mi nueva rama feature/felipe-reina");
    }
}
