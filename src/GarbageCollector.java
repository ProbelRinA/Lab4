public class GarbageCollector {
    public static void main(String[] args) {
        // Tworzenie i usuwanie obiektów
        for (int i = 0; i < 10000; i++) {
        new GarbageCollector();
    }
    // Sugestia uruchomienia Garbage Collector'a
    System.gc();
    }

    // Przykładowy obiekt
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obiekt został usunięty");
    }

    /*GarbageCollector zostaje uruchomiony w takich sytuacjach:
     1. Brak pamięci
     2. Podczas wywoływania 'System.gc()'
     3. W trakcie alokacji nowej pamięci
     4. W czasie trwania programu

     Podczas ręcznym uruchomieniu GrabageCollector dzieją się:
     1. Finalizacja obiektów
     2. Zbieranie nieużywanej pamięci
     3. Zarządzanie obszarami pamięci
     4. Ewentualne zignorowanie z powodu JMV
     5. Wywołanie metody finalize()
    */
}
