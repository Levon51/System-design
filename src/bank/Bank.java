package bank;

import model.CardHolder;

import java.util.List;

public class Bank {
    private String name;
    private String address;
    private List<CardHolder> list;

    public Bank(String name, String address, List<CardHolder> list) {
        this.name = name;
        this.address = address;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CardHolder> getList() {
        return list;
    }

    public void setList(List<CardHolder> list) {
        this.list = list;
    }
}
