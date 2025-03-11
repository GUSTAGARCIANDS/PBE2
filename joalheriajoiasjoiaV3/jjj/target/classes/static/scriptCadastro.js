document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroclienteForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nomeCliente = document.getElementById("nomeCliente").value;

		const cpf = document.getElementById("cpf").value;

		const emailCliente = document.getElementById("emailCliente").value;

		const telefoneCliente = document.getElementById("telefoneCliente").value;

		const dataNascimento = document.getElementById("dataNascimento").value;

		try {
			const response = await fetch("http://localhost:8080/cadastrocliente", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nomeCliente,
					cpf,
					emailCliente,
					telefoneCliente,
					dataNascimento

				}),
			});

			if (response.ok) {
				alert("Cliente cadastrado com sucesso!");
			}
			else {
				alert("Erro ao cadastrar o cliente");
			}
		}
		catch (error) {
			console.error("Erro ao cadastrar o cliente:", error)
		}
	});
});
