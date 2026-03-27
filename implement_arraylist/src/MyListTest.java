void main() {
    MyList<Integer> listInteger = new MyList<>();

    listInteger.add(10);
    listInteger.add(20);
    listInteger.add(30);
    listInteger.add(40);

    IO.println("Kích thước danh sách ban đầu: " + listInteger.size());

    IO.println("Phần tử tại vị trí index 2: " + listInteger.get(2));

    listInteger.add(1, 15);
    IO.println("Phần tử tại vị trí index 1 sau khi chèn: " + listInteger.get(1));

    IO.println("Vị trí index của 30: " + listInteger.indexOf(30));
    IO.println("Có chứa 20 không? " + listInteger.contains(20));
    IO.println("Có chứa 99 không? " + listInteger.contains(99));

    Integer removedItem = listInteger.remove(3);
    IO.println("Phần tử đã xóa ở vị trí index 3: " + removedItem);
    IO.println("Kích thước mới sau khi xóa: " + listInteger.size());

    listInteger.clear();
    IO.println("Kích thước sau khi gọi clear(): " + listInteger.size());
}