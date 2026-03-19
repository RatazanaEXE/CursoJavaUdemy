package src.sesao23.aula.exercicio;

public class Cesto <T>{

    private T dentroDoCesto;

    public void guardar(T obj){
        this.dentroDoCesto = obj;
    }

    public T pegar (){
        return dentroDoCesto;
    }
}
