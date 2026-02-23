# Bertoti
Atividade 1. Comentar com suas palavras o primeiro trecho do livro Software Engineering at Google, Oreilly. (primeiro post)

O texto começa nos perguntando se sabemos as diferenças entre um programador e um engenheiro de software, nisso ele começa a citar um pouco das diferenças entre as duas coisas, cita que na programação apenas é algo mais simples, já a engenharia começa a aplicar conhecimentos práticos e teóricos para criar sistemas de softwares mais elaborados. 

Inclusive se compara com outras engenharias como a Areonáutica onde tudo precisa ser friamente calculado, já na engenharia de software não é dessa forma. 


Atividade 2. Comentar com suas palavras o segundo trecho do livro Software Engineering at Google, Oreilly.(segundo post)

O texto cita que a engenharia de software vai além de escrever código, abrangendo todos os processos e ferramentas que uma organização utiliza para construir e manter o código ao longo do tempo. O livro busca explorar práticas que possam tornar o código mais sustentável e a engenharia de software mais rigorosa, destacando a ideia de que a engenharia de software pode ser vista como "programação integrada ao longo do tempo".

A obra foca em três princípios fundamentais que as organizações de software devem considerar ao projetar, arquitetar e escrever seu código:

Tempo e Mudança: Como o código precisará se adaptar ao longo de sua vida útil.

Escala e Crescimento: Como a organização deve se adaptar à medida que cresce e evolui.

Compromissos e Custos: Como as decisões devem ser tomadas levando em conta o tempo, as mudanças e a escala de crescimento da organização.

A ideia central é que o código deve ser pensado para ser sustentável, capaz de reagir às mudanças ao longo de seu ciclo de vida, desde a concepção até a manutenção e eventual descontinuação.



3 - Requisitos não funcionais
 Listar 5 requisitos não funcionais e descrevê-los com suas palavras (ver slides 8, 9 e 10) 

Disponibilidade (Availability) - Refere-se ao percentual de tempo em que o sistema deve estar funcionando e acessível.
Exemplo: um sistema bancário que precisa operar 24/7 com 99,9% de disponibilidade.
Quanto maior a disponibilidade, menor o tempo de indisponibilidade aceitável.

Escalabilidade (Scalability) - É a capacidade do sistema de continuar funcionando bem quando o número de usuários ou requisições aumenta.
Exemplo: um site de leilão online que precisa suportar milhares de usuários simultâneos sem travar.

Desempenho (Performance) - Relaciona-se ao tempo de resposta e à eficiência do sistema no uso de recursos (CPU, memória, rede).
Exemplo: uma página que deve carregar em até 2 segundos mesmo com muitos acessos.

Segurança (Security) - Garante proteção contra acessos indevidos, ataques e vazamento de informações.
Inclui autenticação, autorização, criptografia e controle de acesso.

Confiabilidade (Reliability) - Capacidade do sistema de funcionar corretamente por longos períodos sem falhas.
Um sistema confiável evita erros críticos e mantém seu funcionamento mesmo diante de situações inesperadas.




4 - Trade-offs (negociação entre requisitos não funcionais)
 Citar e descrever 3 cenários de trade-offs (ver slide 12, mas usar outros exemplos)

Trade-offs (negociação entre requisitos não funcionais)

Trade-offs acontecem quando melhorar um requisito prejudica outro, exigindo uma decisão de equilíbrio.

Cenário 1 – Segurança vs. Usabilidade

Implementar autenticação com múltiplos fatores aumenta a segurança, mas pode tornar o acesso mais demorado e menos prático para o usuário.

Cenário 2 – Desempenho vs. Custo

Para melhorar o desempenho, pode ser necessário investir em servidores mais potentes ou em infraestrutura de nuvem, aumentando os custos do projeto.

Cenário 3 – Escalabilidade vs. Complexidade

Criar uma arquitetura preparada para milhões de usuários torna o sistema mais escalável, mas também mais complexo de desenvolver e manter.



Atividade 5. É possível testar tudo? 
Não é possível testar tudo, pelo numero de vezes que será possível ser feito para o teste completo, o que podemos fazer é testar a funcionalidade no geral. 

int blech (int j ){
 j = j -1 // deveria ser j = j + 1
 j = j/30000
 return = j
}

Quantas entradas mostram o Erro ? 
4 entradas 

Quais são?
29.999, 30.000, -29.999 e -30000
