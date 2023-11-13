package lesson3;

//Описать собственную коллекцию – список на основе массива.
//        Коллекция должна иметь возможность хранить любые типы данных, иметь методы добавления и удаления элементов.


import java.util.Arrays;

public class MyList<T> {
    private T[] objects;
    private int size;

    public MyList(int size) {
        this.objects = (T[]) new Object[size];
    }

//    удаление перебором по элементом
    public void add(T element){
        if(size >= objects.length) {
            objects = Arrays.copyOf(objects,objects.length * 2 );
        }
        objects[size++] = element;

    }
    public void del(T element){
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(element)){
                for (int j = i; j < size -1 ; j++) {
                    objects[j] = objects[j + 1];
                }
            }
        }
    }
//удаление по индексу
    public void remove(int index) {
// Проверка пределов
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }

// Копирование элементов
        for (int i = index; i < size - 1; i++) {
            objects[i] = objects[i + 1];
        }

        size--;
    }


    public T get(int index){
        return objects[index];
    }

    public int getSize() {
        return size;
    }

}
