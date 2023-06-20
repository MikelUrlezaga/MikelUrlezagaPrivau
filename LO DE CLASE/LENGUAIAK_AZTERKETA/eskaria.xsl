<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:param name="title" select="'Eskaria 105'"/>
    <xsl:template match="/">
        <html>
            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
                <title>
                    Eskaria <xsl:value-of select="eskaria/@id" />
                </title>
                <link rel="stylesheet" href="css/styles.css"/>
                <meta charset="utf-8"/>
            </head>
            <body>
                <header>
                    <h1>
                        Eskaria <xsl:value-of select="eskaria/@id" />
                    </h1>
                    <p>
                        <b>Data: </b> <xsl:apply-templates select="eskaria/eskaera_data"/>
                        <span>
                        <xsl:attribute name="class">
                            <xsl:choose>
                                <xsl:when test="eskaria/egoera/@id=1">yellow-bullet</xsl:when>
                                <xsl:when test="eskaria/egoera/@id=2">red-bullet</xsl:when>
                                <xsl:when test="eskaria/egoera/@id=3">shipped-bullet</xsl:when>
                            </xsl:choose>
                        </xsl:attribute>                       
                            <xsl:choose>
                                <xsl:when test="eskaria/egoera/@id=1">
                                Zain
                                </xsl:when>
                                <xsl:when test="eskaria/egoera/@id=2">
                                Ezeztatuta
                                </xsl:when>
                                <xsl:when test="eskaria/egoera/@id=3">
                                Bidalita
                                </xsl:when>
                            </xsl:choose>
                        </span>
                    </p>
                </header>
                <main>
                    <xsl:template match="eskaria">
                        <xsl:if test="saltzailea">
                            <xsl:template match="saltzailea">
                                <div class="user employee shadow">
                                    <p class="header">Erabiltzailea
                                    <img src="{abatar}"></img>
                                    <span><xsl:apply-templates select="izena"/></span>
                                    <span><xsl:apply-templates select="abizena"/></span>
                                    <span class="text-muted"><span> ( <xsl:apply-templates select="emaila"/> ) </span></span>
                                    </p>
                                </div>
                            </xsl:template>
                        </xsl:if>
                    </xsl:template>
                    <xsl:template match="eskaria">
                        <xsl:template match="lerroak">
                        <xsl:template match="item">
                        <xsl:template match="produktua">
                            <h2>Lerroak</h2>
                            <ul class="table-items">
                                <li class="table-header">
                                    <div class="col col-name">Izena</div>
                                    <div class="col col-category">Kategoria</div>
                                    <div class="col col-price">Salneurria</div>
                                    <div class="col col-op"></div>
                                    <div class="col col-amount">Kopurua</div>
                                    <div class="col col-op"></div>
                                    <div class="col col-total">Total</div>
                                </li>
                            </ul>
                            <ul>
                                <li class="table-row shadow">
                                    <div class="col col-name">
                                        <img src="{irudia}"><xsl:apply-templates select="izena"/></img>
                                        <span class="text-muted"><xsl:apply-templates select="deskribapena"/></span>
                                    </div>
                                    <div class="col col-category"><xsl:apply-templates select="kategoria"/></div>
                                    <div class="col col-price"><xsl:apply-templates select="salneurria"/></div>
                                    <div class="col col-op">x</div>
                                    <div class="col col-amount"><xsl:apply-templates select="../kopurua"/></div>
                                    <div class="col col-op">=</div>
                                    <div class="col col-total"></div>
                                </li>
                            </ul>
                        </xsl:template>
                        </xsl:template>
                        </xsl:template>
                    </xsl:template>
                </main>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>