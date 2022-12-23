package com.t2tierp.cadastros.java;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.openswing.swing.message.receive.java.ValueObjectImpl;


/**
* <p>Title: T2Ti ERP
* <p>Description:  VO relacionado a tabela [FPAS]
*
* <p>The MIT License
*
* <p>Copyright: Copyright (C) 2010 T2Ti.COM
*
* Permission is hereby granted, free of charge, to any person
* obtaining a copy of this software and associated documentation
* files (the "Software"), to deal in the Software without
* restriction, including without limitation the rights to use,
* copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the
* Software is furnished to do so, subject to the following
* conditions:
*
* The above copyright notice and this permission notice shall be
* included in all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
* OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
* NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
* HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
* WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
* FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
* OTHER DEALINGS IN THE SOFTWARE.
*
*        The author may be contacted at:
*            t2ti.com@gmail.com</p>
*
* @author Claudio de Barros (t2ti.com@gmail.com)
* @version 1.0
*/
@Entity
@Table(name = "FPAS")
public class FpasVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "CNAE")
    private String cnae;
    @Column(name = "ALIQUOTA_SAT")
    private BigDecimal aliquotaSat;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "PERCENTUAL_INSS_PATRONAL")
    private BigDecimal percentualInssPatronal;
    @Column(name = "CODIGO_TERCEIRO")
    private BigDecimal codigoTerceiro;
    @Column(name = "PERCENTUAL_TERCEIROS")
    private BigDecimal percentualTerceiros;

    public FpasVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public BigDecimal getAliquotaSat() {
        return aliquotaSat;
    }

    public void setAliquotaSat(BigDecimal aliquotaSat) {
        this.aliquotaSat = aliquotaSat;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPercentualInssPatronal() {
        return percentualInssPatronal;
    }

    public void setPercentualInssPatronal(BigDecimal percentualInssPatronal) {
        this.percentualInssPatronal = percentualInssPatronal;
    }

    public BigDecimal getCodigoTerceiro() {
        return codigoTerceiro;
    }

    public void setCodigoTerceiro(BigDecimal codigoTerceiro) {
        this.codigoTerceiro = codigoTerceiro;
    }

    public BigDecimal getPercentualTerceiros() {
        return percentualTerceiros;
    }

    public void setPercentualTerceiros(BigDecimal percentualTerceiros) {
        this.percentualTerceiros = percentualTerceiros;
    }


}
