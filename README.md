# SePrecisarLembrar

## Projeto cadstrarClienteGerarPedido

### Classe ItemPedido 

* toString com String.format L47
* Método sub total = (quantidade * valor) L43
* Relacionamento 1 para 1 = encontra comentario explicando. L7

### Classe Cliente

* SimpleDateFormat = para receber dados e imprimir datas editadas (Instanciamento L8 / uso L60)

### Pedido

* Relacionamento um para muitos = Criando List L17
* Métodos Add e Remove L53
* Método total = Esse metodo soma todos os itens mostrando o valor total de todos os itens e fechando o pedido L61
* toString = usando Builder L70

### ProgramaPrincipal

* Locale L18
* Scanner L19
* SimpleDateFormat L20
* Solicita dados do cliente. =L 22-30
* Instanciamento do objeto do tipo Cliente L32
* solicita status do pedido que é um Enum = L34 - L36
* Instancia um obj Pedido recebendo seus atributos e o obj cliente de argumentos = L38
* O obj Pedido recebe como data o momento da instanciação do obj com o new Date() = L38
* Solicita a quantidade de itens que o pedido vai ter = L40 - L41
* Cria-se um for para receber os dado de cada item e instancia obj produto e ItemPedido no fim solicita para adicionar na List o obj Item. L42 - L56
* manda imprimir o obj pedido L59
* fim L63
