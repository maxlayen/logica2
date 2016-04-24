
/**
 * @author Maxwell & Alex
 */
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno[] alunos = BancoDeAlunos.carregarRegistroAlunos();
		double[][] notas = new double[alunos.length][3];
		String matriculas[] = new String[alunos.length];
		String matricula;
		int indice;
		// Q5
		double[] medias;

		// Q3
		imprimirValores(alunos);

		for (int i = 0; i < alunos.length; i++) {
			matriculas[i] = alunos[i].matricula;
			notas[i][0] = alunos[i].nota1;
			notas[i][1] = alunos[i].nota2;
			notas[i][2] = alunos[i].nota3;
		}

		// Q5
		medias = calcularMedias(notas);

		// Q7
		imprimirMediaAlunos(alunos, medias);

		// Q9 e Q10
		do {
			System.out.println("Informe uma matricula: ");
			matricula = scanner.next();
			if (!matricula.equals("0")) {
				if (buscarMatricula(matriculas, matricula)) {
					System.out.println("Matrícula Válida.");
				} else {
					System.out.println("Matrícula Inválida.");
				}
			}
		} while (!matricula.equals("0"));

		// Q12
		do {
			System.out.println("Informe uma matricula: (0 para encerrar)");
			matricula = scanner.next();
			indice = buscarIndiceMatricula(matriculas, matricula);
			if (!matricula.equals("0")) {
				if (indice == -1) {
					System.out.println("Matrícula Inválida.");
				} else {
					System.out.printf("Nome: %s\tMédia: %.1f\n", alunos[indice].nome, medias[indice]);
				}
			}
		} while (!matricula.equals("0"));
		
		scanner.close();
	}
	// Q1 e Q2
	public static void imprimirValores(Aluno[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			System.out.printf("%s\t%s\t%.1f\t%.1f\t%.1f\n", alunos[i].matricula, alunos[i].nome, alunos[i].nota1, alunos[i].nota2 , alunos[i].nota3);
		}
	}

	// Q4
	public static double[] calcularMedias(double[][] matrizDeNotas) {
		double medias[] = new double[10];

		for (int i = 0; i < medias.length; i++) {
			medias[i] = (matrizDeNotas[i][0] + matrizDeNotas[i][1] + matrizDeNotas[i][2]) / 3;
		}

		return medias;
	}

	// Q6
	public static void imprimirMediaAlunos(Aluno[] alunos, double[] medias) {
		System.out.printf("\nMédia dos alunos\n");
		for (int i = 0; i < alunos.length; i++) {
			System.out.printf("%s\t%2.1f\n", alunos[i].nome, medias[i]);
		}

	}

	// Q8
	public static boolean buscarMatricula(String[] matriculas, String matriculaBusca) {
		boolean existeMatricula = false;

		for (int i = 0; i < matriculas.length; i++) {
			if (matriculas[i].equals(matriculaBusca)) {
				existeMatricula = true;
			}
		}

		return existeMatricula;

	}

	// Q11
	public static int buscarIndiceMatricula(String[] matriculas, String matriculaBusca) {
		int existeMatricula = -1;

		for (int i = 0; i < matriculas.length; i++) {
			if (matriculas[i].equals(matriculaBusca)) {
				existeMatricula = i;
			}
		}

		return existeMatricula;

	}

}
