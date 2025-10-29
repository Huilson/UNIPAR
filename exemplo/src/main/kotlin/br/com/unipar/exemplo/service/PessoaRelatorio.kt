package br.com.unipar.exemplo.service

import br.com.unipar.exemplo.database.PessoaRepository
import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import org.springframework.stereotype.Service

@Service
class PessoaRelatorio (
    private val pessoaRepository: PessoaRepository
){
    fun gerarRelatorio() : ByteArray{
        //gerar relatorio de todas as pessoas do banco
        val pessoas = pessoaRepository.findAll()

        val input = this::class.java.getResourceAsStream("/templates/relatorioPessoa.jrxml")
            ?: throw RuntimeException("Desculpe amigo, mas não achei o arquivo jrxml")

        val relatorio = JasperCompileManager.compileReport(input)
        val conteudo = JRBeanCollectionDataSource(pessoas)
        val parametros = mutableMapOf<String, Any>()

        val pdf = JasperFillManager.fillReport(
            relatorio, parametros, conteudo
        )
        return JasperExportManager.exportReportToPdf(pdf)
    }
}