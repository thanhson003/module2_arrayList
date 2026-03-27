public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("=== KIỂM THỬ MY LINKED LIST ===");

        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("Hà Nội");
        list.add("Đà Nẵng");
        list.add("Hồ Chí Minh");

        list.addFirst("Hải Phòng");
        list.addLast("Cần Thơ");
        list.add(2, "Huế");

        System.out.println("Số lượng phần tử: " + list.size());

        System.out.println("Phần tử đầu tiên: " + list.getFirst());
        System.out.println("Phần tử cuối cùng: " + list.getLast());
        System.out.println("Phần tử ở index 2: " + list.get(2));

        System.out.println("Có chứa 'Đà Nẵng' không? " + list.contains("Đà Nẵng"));
        System.out.println("Vị trí của 'Cần Thơ': " + list.indexOf("Cần Thơ"));

        String removedStr = list.remove(1);
        System.out.println("Đã xóa: " + removedStr);

        list.remove("Huế");
        System.out.println("Số lượng sau khi xóa: " + list.size());


        System.out.print("Danh sách hiện tại: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i < list.size() - 1 ? ", " : ""));
        }
        System.out.println();


        list.clear();
        System.out.println("Kích thước sau khi clear(): " + list.size());
    }
}