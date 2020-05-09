# Firebase-Facilit
O Firebase tem diversas  funções e comandos. O qual podem ser usados juntos ou separadas, e na documentação do Firebase só tem exemplos de uso separado.
O Facilit é uma biblioteca para facilitar o uso do Firebase, fazer métodos o qual tenha os comandos do firebase de forma simples, tendo que incluir só os dados que vão ser salvos. E contendo os casos que usei o firebase de forma diferente o qual mostra na documentação dele e que funciona.

### Instalação

------------

No Gradle nível de projeto coloca o link para o servidor do JitPack, o qual foi usado pra subir a biblioteca.

    allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }

No Gradle nível de app coloca o implementation junto com o link do github e a versão.

    implementation 'com.github.Sprained:Firebase-Facilit:0.1.0'

### Utilização

------------

Na biblioteca foi usado muito o Map do java, para poder pegar e setar os dados nas classes, sem precisar ficar mandando linhas e linhas de informações.
```java
public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("nameEx", name);
        result.put("passEx", pass);
		result.put("cityEX", city)

        return result;
    }
```
O map ele funciona como se fosse um constructor, ele consegue pegar as variáveis de uma classe e setar essas variáveis. A vantagem de usar o map é que pode fazer de vários jeitos para pegar ou setar as informações o qual precisa, e pode ter mais de um map por classe também.

Após a criação do map so instanciar o Facilit e utilizar os comandos dele.
```java
Facilit facilit = new Facilit();
```

### Comandos

------------

O initializeDatabase serve para inicializar todas as funções do firebase o qual será usado, deve ser passado no início e tem que passar a Activity o qual ela ta.
```java
facilit.initializeDatabase(this);
```

O insert serve para fazer cadastro no banco de dados no realtime database. Passa para a função uma string que vai ser o nó o qual vai ser feito o cadastro dos dados, uma string que será o id e o map com os dados que querem cadastrar.
```java
facilit.insert(child, id, map);
```

O creatUserAuthAndRealtimeWhithId serve para tanto criar o usuário no auth quanto para inserir ele no realtime database com o mesmo id do auth. Passa para a função o e-mail e a senha(sendo em string) uma string que vai ser o nó o qual vai ser feito o cadastro dos usuários e o map com os dados que querem cadastrar.
```java
facilit.creatUserAuthAndRealtimeWhithId(email, password, child,  map);
```
Uma dica, não há necessidade de colocar o email e a senha no map pois ambos ja serão requisitados no auth.

O singInUserAuthAndRealtimeWhithId serve para fazer login no auth e pegar os dados do usuário e setar no map. Passa para a função o e-mail e a senha(sendo em string) uma string que vai ser o nó o qual vai ser requisitado os dados dos usuários e o map com os dados que quer que seja requisitado.
```java
facilit.singInUserAuthAndRealtimeWhithId(email, password, child,  map);
```
