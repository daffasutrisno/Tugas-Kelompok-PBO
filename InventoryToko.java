import java.util.HashMap;
import java.util.Map;

class InventoryToko implements Storable {
    private Map<String, Integer> itemMap;
    private int totalItem;

    public InventoryToko() {
        this.itemMap = new HashMap<>();
        this.totalItem = 0;
    }

    @Override
    public void tambahItem(String item, int jumlah) {
        if (itemMap.containsKey(item)) {
            itemMap.put(item, itemMap.get(item) + jumlah);
        } else {
            itemMap.put(item, jumlah);
        }
        totalItem += jumlah;
        System.out.println(jumlah + " unit " + item + " added to stock.");
    }

    @Override
    public void hapusItem(String item) {
        if (itemMap.containsKey(item)) {
            totalItem -= itemMap.get(item);
            itemMap.remove(item);
            System.out.println(item + " deleted from store.");
        } else {
            System.out.println(item + " item not available.");
        }
    }

    // Implementasi tampilkanItem
    @Override
    public void tampilkanItem() {
        if (itemMap.isEmpty()) {
            System.out.println("\nStock empty.");
        } else {
            System.out.println("\nStock in store :");
            for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " unit");
            }
            System.out.println("Total item : " + totalItem);
        }
    }
}
