function calcularIMC() {
  // Obtém os valores dos campos
  const peso = parseFloat(document.getElementById('peso').value);
  const altura = parseFloat(document.getElementById('altura').value);
  const resultado = document.getElementById('resultado');
  
  // Validação dos dados
  if (isNaN(peso) || isNaN(altura) || peso <= 0 || altura <= 0) {
    resultado.innerHTML = '<p class="erro">Por favor, insira valores válidos!</p>';
    return;
  }
  
  // Passo 1: Eleva a altura ao quadrado
  const alturaAoQuadrado = altura * altura;
  
  // Passo 2: Calcula o IMC dividindo o peso pela altura ao quadrado
  const imc = peso / alturaAoQuadrado;
  
  // Determina a categoria
  let categoria = '';
  let cor = '';
  
  if (imc < 18.5) {
    categoria = 'Abaixo do peso';
    cor = '#3498db';
  } else if (imc >= 18.5 && imc < 25) {
    categoria = 'Peso normal';
    cor = '#2ecc71';
  } else if (imc >= 25 && imc < 30) {
    categoria = 'Sobrepeso';
    cor = '#f39c12';
  } else if (imc >= 30 && imc < 35) {
    categoria = 'Obesidade Grau I';
    cor = '#e67e22';
  } else if (imc >= 35 && imc < 40) {
    categoria = 'Obesidade Grau II';
    cor = '#d35400';
  } else {
    categoria = 'Obesidade Grau III';
    cor = '#c0392b';
  }
  
  // Exibe o resultado
  resultado.innerHTML = `
    <div class="resultado-card" style="border-left: 5px solid ${cor}">
      <h3>Seu IMC é: <strong>${imc.toFixed(2)}</strong></h3>
      <p class="categoria" style="color: ${cor}">Categoria: ${categoria}</p>
      <div class="calculo-detalhado">
        <p><strong>Cálculo:</strong> ${peso} ÷ (${altura} × ${altura})</p>
        <p>${peso} ÷ ${alturaAoQuadrado.toFixed(2)} = ${imc.toFixed(2)}</p>
      </div>
    </div>
  `;
}

// Permite calcular pressionando Enter
document.addEventListener('DOMContentLoaded', function() {
  const inputs = document.querySelectorAll('input');
  inputs.forEach(input => {
    input.addEventListener('keypress', function(e) {
      if (e.key === 'Enter') {
        calcularIMC();
      }
    });
  });
});