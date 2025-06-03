class RansomNote:
    def can_construct(self, ransom_note: str, magazine: str) -> bool:
        # Paso 1: Crear una lista de frecuencias para magazine
        freq = [0] * 26  # Para letras 'a' a 'z'
        for c in magazine:
            freq[ord(c) - ord('a')] += 1

        # Paso 2: Verificar si ransom_note puede construirse
        for c in ransom_note:
            if freq[ord(c) - ord('a')] == 0:
                return False  # No hay suficientes letras
            freq[ord(c) - ord('a')] -= 1

        return True  # Se pudo construir
