import java.util.Iterator;

private class MinhaIterator implements Iterator<String> {
        private int indice = 0;

        // Método da interface Iterator para verificar se ainda há elementos na lista
        @Override
        public boolean hasNext() {
            return indice < lista.length;
        }

        // Método da interface Iterator para retornar o próximo elemento da lista
        @Override
        public String next() {
            return lista[indice++];
        }

        // Método da interface Iterator para remover um elemento da lista
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }