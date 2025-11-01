# Au# 📊 Calculadora de IMC

## 🎯 O que é este projeto?

Uma calculadora simples e bonita que calcula o seu **IMC (Índice de Massa Corporal)** e mostra em qual categoria você está!

> **IMC** é uma medida usada para saber se o seu peso está adequado para a sua altura.

---

## 🌟 O que a calculadora faz?

✅ Calcula seu IMC automaticamente  
✅ Mostra em qual categoria você está  
✅ Exibe os passos do cálculo  
✅ Usa cores diferentes para cada categoria  
✅ Funciona no celular, tablet e computador  

---

## 🚀 Como usar?

### Passo 1: Abrir o arquivo
1. Salve o código HTML em um arquivo chamado `calculadora-imc.html`
2. Dê um duplo clique no arquivo
3. Ele vai abrir no seu navegador (Chrome, Firefox, Edge, etc.)

### Passo 2: Preencher os dados
1. **Digite seu peso** em quilogramas (exemplo: 70)
2. **Digite sua altura** em metros (exemplo: 1.75)
3. Clique no botão **"Calcular IMC"** ou aperte **Enter**

### Passo 3: Ver o resultado
A calculadora vai mostrar:
- 📈 Seu IMC (exemplo: 22.86)
- 🎨 Sua categoria com cor (exemplo: Peso normal - verde)
- 🧮 Como foi feito o cálculo

---

## 📐 Como funciona o cálculo?

A calculadora usa esta fórmula:

```
IMC = peso ÷ (altura × altura)
```

### Exemplo prático:
Se você pesa **70 kg** e tem **1,60 m** de altura:

**Passo 1:** Multiplica a altura por ela mesma  
1,60 × 1,60 = 2,56

**Passo 2:** Divide o peso pelo resultado  
70 ÷ 2,56 = 27,34

**Resultado:** Seu IMC é **27,34** (Sobrepeso)

---

## 🎨 Categorias do IMC

A calculadora usa estas categorias (padrão da OMS):

| IMC | Categoria | Cor |
|-----|-----------|-----|
| Abaixo de 18,5 | Abaixo do peso | 🔵 Azul |
| 18,5 a 24,9 | Peso normal | 🟢 Verde |
| 25,0 a 29,9 | Sobrepeso | 🟡 Amarelo |
| 30,0 a 34,9 | Obesidade Grau I | 🟠 Laranja |
| 35,0 a 39,9 | Obesidade Grau II | 🟠 Laranja escuro |
| Acima de 40 | Obesidade Grau III | 🔴 Vermelho |

---

## 💻 Tecnologias usadas

Este projeto usa apenas **3 tecnologias básicas da web**:

### 🎨 HTML (HyperText Markup Language)
- Cria a estrutura da página
- Define os campos de entrada (peso e altura)
- Mostra o botão e os resultados

### 🎭 CSS (Cascading Style Sheets)
- Deixa a página bonita e colorida
- Cria o design moderno com degradê roxo
- Faz as animações quando o resultado aparece
- Adapta o tamanho para celular e computador

### ⚡ JavaScript
- Faz os cálculos do IMC
- Verifica se você digitou números válidos
- Define a categoria baseada no resultado
- Escolhe a cor de cada categoria
- Mostra o resultado na tela

---

## 🔧 Estrutura do código

### HTML - A Base
```html
<input type="number" id="peso">     <!-- Campo para digitar o peso -->
<input type="number" id="altura">   <!-- Campo para digitar a altura -->
<button onclick="calcularIMC()">    <!-- Botão que faz o cálculo -->
<div id="resultado">                <!-- Área onde aparece o resultado -->
```

### JavaScript - O Cérebro
```javascript
function calcularIMC() {
  // 1. Pega os valores que você digitou
  const peso = parseFloat(document.getElementById('peso').value);
  const altura = parseFloat(document.getElementById('altura').value);
  
  // 2. Calcula: altura × altura
  const alturaAoQuadrado = altura * altura;
  
  // 3. Calcula: peso ÷ (altura × altura)
  const imc = peso / alturaAoQuadrado;
  
  // 4. Define a categoria baseada no IMC
  // 5. Mostra o resultado na tela
}
```

### CSS - A Beleza
```css
background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
/* Cria o fundo roxo degradê */

border-radius: 20px;
/* Deixa os cantos arredondados */

animation: slideIn 0.5s ease;
/* Faz o resultado aparecer suavemente */
```

---

## 🎓 Para professores e educadores

Este projeto é ótimo para ensinar:

### Matemática
- ➗ Divisão e multiplicação
- 📊 Proporções e razões
- 🔢 Números decimais
- 📈 Interpretação de dados

### Programação
- 🎯 Variáveis e tipos de dados
- 🔀 Estruturas condicionais (if/else)
- 🎨 Manipulação do DOM
- ✅ Validação de entrada

### Saúde
- 💪 Educação sobre peso saudável
- 📋 Interpretação de índices médicos
- 🏥 Conscientização sobre saúde

---

## ⚠️ Importante saber

- 🩺 O IMC é apenas uma **referência geral**
- 👶 Não é preciso para crianças e adolescentes
- 💪 Não considera massa muscular
- 👴 Pode variar para idosos
- 🏃 Atletas podem ter IMC alto mesmo estando saudáveis
- 🏥 **Sempre consulte um médico ou nutricionista para avaliação completa!**

---

## 🐛 Problemas comuns e soluções

### A calculadora não abre
- ✅ Certifique-se que salvou com extensão `.html`
- ✅ Tente abrir com outro navegador
- ✅ Verifique se copiou o código completo

### Não aparece o resultado
- ✅ Digite números válidos (maior que zero)
- ✅ Use ponto (.) para decimais, não vírgula
- ✅ Verifique se clicou no botão "Calcular"

### Número com vírgula não funciona
- ✅ Use **ponto** em vez de vírgula (1.75 e não 1,75)

---

## 📱 Compatibilidade

Funciona em:
- ✅ Chrome
- ✅ Firefox
- ✅ Safari
- ✅ Edge
- ✅ Opera
- ✅ Celulares Android
- ✅ iPhones e iPads

---

## 🎨 Personalização

Quer mudar as cores? É fácil!

### Mudar a cor de fundo
Procure esta linha no CSS:
```css
background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
```
Troque `#667eea` e `#764ba2` por suas cores favoritas!

### Mudar a cor dos botões
Procure:
```css
background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
```
Na seção `button` do CSS.

---

## 📚 Aprenda mais

### Sobre IMC
- [Ministério da Saúde - IMC](https://www.gov.br)
- [Organização Mundial da Saúde](https://www.who.int)

### Sobre programação
- [MDN Web Docs](https://developer.mozilla.org) - Documentação completa
- [W3Schools](https://www.w3schools.com) - Tutoriais para iniciantes

---

## 📝 Licença

Este projeto é **livre** para usar! Você pode:
- ✅ Usar em projetos pessoais
- ✅ Modificar como quiser
- ✅ Compartilhar com amigos
- ✅ Usar em escolas e cursos

---

## 🤝 Contribuições

Melhorou o código? Achou um erro? Quer adicionar recursos?

Sugestões de melhorias:
- 📊 Adicionar gráfico de evolução do IMC
- 💾 Salvar histórico de medições
- 🌍 Adicionar outros idiomas
- 🎯 Calcular peso ideal
- 📱 Criar versão para aplicativo

---

## ✨ Créditos

Desenvolvido com ❤️ para ajudar pessoas a entenderem melhor sua saúde!

**Versão:** 1.0  
**Última atualização:** 2025  

---

## 📞 Contato

Dúvidas? Sugestões? Sinta-se à vontade para:
- 💬 Compartilhar com amigos
- 🎓 Usar em sala de aula
- 🔧 Modificar e melhorar

---

**Divirta-se calculando! 🎉**la-13