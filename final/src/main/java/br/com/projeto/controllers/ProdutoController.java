package br.com.projeto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.projeto.models.Produto;
import br.com.projeto.repository.ProdutoRepository;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoRepository pr;
	
	@RequestMapping(value="/cadastrarProduto", method=RequestMethod.GET)
	public String form() {
		return "paginas/formProduto";
	}
	
	@RequestMapping(value="/cadastrarProduto", method=RequestMethod.POST)
	public String form(Produto produto) {
		
		// cadastrar produto
		pr.save(produto);
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/produtos")
	public ModelAndView listaProdutos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Produto> produtos = pr.findAll();
		mv.addObject("produtos", produtos);
		return mv;
	}
	
	@RequestMapping(value="/alterarProduto/{codigo}", method=RequestMethod.GET)
	public ModelAndView alterarProduto(@PathVariable("codigo") long codigo) {
		Produto produto = pr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("paginas/alterarProduto");
		mv.addObject("produto", produto);
		return mv;
	}
	
	@RequestMapping(value="/alterarProduto/{codigo}", method=RequestMethod.POST)
	public String alterarProdutoPost(@PathVariable("codigo") long codigo, Produto produto){
		pr.save(produto);
		return "redirect:/";
		}
	
	@RequestMapping("/deletar")
	public String deletarProduto(long codigo) {
		Produto produto = pr.findByCodigo(codigo);
		pr.delete(produto);
		return "redirect:/";
	}
}
