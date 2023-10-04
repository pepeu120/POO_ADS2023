### Exercícios de Auto-Revisão

1. **Cinco exemplos de exceções comuns em Java:**
   - *NullPointerException*: Lançada quando uma operação é realizada em uma referência de objeto nula.
   - *ArrayIndexOutOfBoundsException*: Lançada quando uma tentativa é feita para acessar um elemento de array fora dos limites válidos.
   - *ArithmeticException*: Lançada quando ocorre um erro aritmético, como divisão por zero.
   - *FileNotFoundException*: Lançada quando um arquivo que se tenta acessar não é encontrado.
   - *IOException*: Lançada quando ocorre um erro durante a entrada/saída, como falha ao ler ou gravar em um arquivo.

2. **Por que as técnicas de tratamento de exceções não devem ser utilizadas para controle convencional de programação?**
   - As exceções são destinadas a lidar com situações excepcionais e inesperadas, e seu uso para controle de fluxo normal pode tornar o código mais difícil de entender e
   manter. Além disso, as exceções têm um custo de desempenho significativo em comparação com o controle de fluxo convencional.

3. **Se nenhuma exceção for disparada em um bloco try, para onde segue o controle quando o bloco try completa a execução?**
   - Se nenhuma exceção for disparada em um bloco *try*, o controle segue diretamente para o bloco seguinte, que pode ser um bloco *catch*, *finally* ou apenas o código após o
   bloco *try*.

4. **O que acontece se ocorrer uma exceção e um tratador de exceções apropriado não puder ser localizado?**
   - Se ocorrer uma exceção e nenhum tratador de exceções apropriado for encontrado no bloco *try* ou em blocos *catch* associados, a exceção será propagada para o método
   chamador. Se o método chamador também não tiver um tratador adequado, a exceção continuará a se propagar pela pilha de chamadas até que seja tratada ou até que o programa
   seja encerrado.

5. **O que acontece se vários tratadores correspondem ao tipo de objeto disparado?**
   - Se vários tratadores correspondem ao tipo de objeto disparado, o tratador mais específico, ou seja, aquele cuja classe está mais próxima na hierarquia de herança, será
   executado. Se não houver um tratador mais específico, o tratador mais genérico será executado.

6. **Qual é a razão fundamental para utilizar blocos finally?**
   - A razão fundamental para usar blocos *finally* é garantir que determinado código seja executado, independentemente de ter ocorrido uma exceção ou não. Os blocos *finally*
   são usados para liberar recursos, como fechar arquivos ou conexões de banco de dados, independentemente de ocorrerem exceções ou não.

7. **O que acontece quando um tratador catch dispara uma Exception?**
   - Quando um tratador *catch* dispara uma exceção (lançando outra exceção dentro do bloco *catch*), essa nova exceção pode ser tratada por um bloco *catch* de nível superior,
   se existir, ou propagada para o método chamador, se não houver tratador adequado dentro do bloco *catch*.

8. **O que acontece com uma referência local em um bloco try quando esse bloco dispara uma Exception?**
   - Se uma referência local em um bloco *try* disparar uma exceção, essa referência não será mais válida após a exceção ser lançada. Se você tentar acessar essa referência
   após a exceção, isso resultará em um erro. Portanto, é importante ter cuidado ao manipular referências em blocos *try-catch*.
