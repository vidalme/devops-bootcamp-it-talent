# CONCEITOS-CHAVE GITHUB ACTIONS
<p>O GitHub Actions é uma ferramenta de automação que permite que você crie, teste e
implemente seu código diretamente do GitHub. Ele é usado para automatizar fluxos de
trabalho (workflows) que podem incluir a compilação, teste e implantação de projetos
de software. Aqui estão os conceitos-chave do GitHub Actions que você precisa
conhecer:
<li>1. <b>Workflows</b>: Um workflow é um processo automatizado que você define no seu
repositório GitHub. Ele é composto por um ou mais jobs e é ativado por
eventos específicos no GitHub, como push, pull request ou até mesmo um
evento programado (cron).
<li>2. <b>Eventos</b>: Os eventos são gatilhos que iniciam um workflow. Por exemplo,
sempre que alguém faz push de código para um repositório ou cria um pull
request, você pode configurar um workflow para ser disparado
automaticamente.
<li>3. <b>Jobs</b>: Um workflow consiste em um ou mais jobs, que são conjuntos de passos
que executam em uma mesma unidade de execução. Os jobs em um workflow
podem ser executados simultaneamente ou de forma sequencial, dependendo
das dependências definidas.
<li>4. <b>Passos (Steps)</b>: Cada job é feito de vários passos, que podem ser comandos
individuais ou ações. Um passo pode ser tão simples quanto um script shell ou
tão complexo quanto uma ação que interage com serviços externos.
<li>5. <b>Ações (Actions)</b>: As ações são os blocos de construção dos passos. Você
pode reutilizar ações que foram criadas pela comunidade ou definir suas
próprias ações. As ações estão disponíveis publicamente no GitHub
Marketplace.
<li>6. <b>Runners</b>: Runners são servidores que hospedam o ambiente onde os jobs do
GitHub Actions são executados. O GitHub oferece runners hospedados, ou
você pode hospedar seu próprio runner para ter controle total sobre o ambiente
de execução, sistema operacional e hardware.
<li>7. <b>Artefatos</b>: Durante ou após a execução de um workflow, você pode salvar
dados gerados, como arquivos de log ou binários compilados, que podem ser
usados em jobs subsequentes ou para análises futuras.
<li>8. <b>Segredos e variáveis de ambiente</b>: Segredos são usados para armazenar
informações sensíveis, como tokens de acesso e senhas, que são necessárias
nos workflows. Variáveis de ambiente podem ser definidas para passar
informações configuráveis entre os passos de um job.
<li>9. <b>Cache</b>: Para reduzir o tempo de execução de jobs frequentemente executados,
o GitHub Actions permite que você armazene e reutilize caches entre
execuções de um workflow. Isso é especialmente útil para dependências de
projetos que não mudam frequentemente.