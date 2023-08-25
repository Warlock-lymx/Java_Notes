package learning.generic;

import org.junit.jupiter.api.Test;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        Dao<User> dao = new Dao<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,13,"mike"));
        List<User> list = dao.list();
        System.out.println(list);
    }
}

class Dao<T> {
    Map<String, T> map = new HashMap<>();

    @Test
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        T entity = map.get(id);
        return entity;
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String id : keySet) {
            list.add(map.get(id));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}