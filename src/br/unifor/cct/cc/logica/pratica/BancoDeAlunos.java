public class BancoDeAlunos {

	public static Aluno[] carregarRegistroAlunos() {
		Aluno[] tudo = new Aluno[10];

		Aluno aluno = new Aluno();
		aluno.matricula = "1020";
		aluno.nome = "Ailton";
		aluno.nota1 = 7.5;
		aluno.nota2 = 8.9;
		aluno.nota3 = 6.5;
		tudo[0] = aluno;

		aluno = new Aluno();
		aluno.matricula = "1042";
		aluno.nome = "Marlos";
		aluno.nota1 = 8.2;
		aluno.nota2 = 7.3;
		aluno.nota3 = 9.4;
		tudo[1] = aluno;

		aluno = new Aluno();
		aluno.matricula = "1112";
		aluno.nome = "Rebeca";
		aluno.nota1 = 10.0;
		aluno.nota2 = 9.6;
		aluno.nota3 = 7.1;
		tudo[2] = aluno;

		aluno = new Aluno();
		aluno.matricula = "1132";
		aluno.nome = "Marcos";
		aluno.nota1 = 6.8;
		aluno.nota2 = 7.5;
		aluno.nota3 = 8.1;
		tudo[3] = aluno;

		aluno = new Aluno();
		aluno.matricula = "1152";
		aluno.nome = "Jane";
		aluno.nota1 = 8.8;
		aluno.nota2 = 7.4;
		aluno.nota3 = 9.2;
		tudo[4] = aluno;

		aluno = new Aluno();
		aluno.matricula = "1201";
		aluno.nome = "Pedro";
		aluno.nota1 = 8.3;
		aluno.nota2 = 7.9;
		aluno.nota3 = 9.0;
		tudo[5] = aluno;

		aluno = new Aluno();
		aluno.matricula = "1213";
		aluno.nome = "Raquel";
		aluno.nota1 = 7.2;
		aluno.nota2 = 8.7;
		aluno.nota3 = 9.8;
		tudo[6] = aluno;

		aluno = new Aluno();
		aluno.matricula = "1232";
		aluno.nome = "Paulo";
		aluno.nota1 = 8.3;
		aluno.nota2 = 7.7;
		aluno.nota3 = 8.9;
		tudo[7] = aluno;

		aluno = new Aluno();
		aluno.matricula = "1256";
		aluno.nome = "Vitor";
		aluno.nota1 = 7.8;
		aluno.nota2 = 7.7;
		aluno.nota3 = 8.5;
		tudo[8] = aluno;

		aluno = new Aluno();
		aluno.matricula = "1271";
		aluno.nome = "Mara";
		aluno.nota1 = 8.0;
		aluno.nota2 = 7.0;
		aluno.nota3 = 9.0;
		tudo[9] = aluno;

		return tudo;

	}

}
