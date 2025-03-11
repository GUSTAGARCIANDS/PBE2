document.getElementById("cep").addEventListener("input", async function(){
	const cep = this.value.replace(/\D/g, "");
	
	if (cep.length === 8){
		try{
			const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
			
			if(!response.ok) throw new Error("Erro ao buscar CEP");
			
			const dados = await response.json();
			
			if(dados.erro){
				alert("CEP")
				return;
			}
			
			document.getElementById("rua").value = dados.logradouro;
			document.getElementById("bairro").value = dados.bairro;
			document.getElementById("cidade").value = dados.localidade;
			document.getElementById("estado").value = dados.estado;
		}
		catch (error){
			alert("Erro ao procurar o endereço: " + error.message);
		}
	}
});

document.getElementById("cadastroEnderecoForm").addEventListener("submit", async function(){
event.preventDefault();

		const numero_casa = document.getElementById("numero_casa").value;

		const rua = document.getElementById("rua").value;

		const bairro = document.getElementById("bairro").value;

		const cidade = document.getElementById("cidade").value;

		const estado = document.getElementById("estado").value;
		
		const cep = document.getElementById("cep").value;
		
		const complemento = document.getElementById("complemento").value;

		try {
			const response = await fetch("http://localhost:8080/cadastroEndereco", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					numero_casa,
					rua,
					bairro,
					cidade,
					estado,
					cep,
					complemento

				}),
			});

			if (response.ok) {
				alert("Endereço do cliente cadastrado com sucesso!");
			}
			else {
				alert("Erro ao cadastrar o endereço do cliente");
			}
		}
		catch (error) {
			console.error("Erro ao cadastrar o endereço do cliente:", error)
		}
	});