<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<t:wrapper>
    <div class="container">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">${currentBook.title}</h5>
                <h6 class="card-subtitle mb-2 text-muted">${currentBook.isbn}</h6>
                <h6 class="card-subtitle mb-2 text-muted">Author: ${currentBook.author}</h6>
                <p class="card-text" style="margin-bottom: 1em">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                <p style="margin-bottom: 1em">Language: ${currentBook.language} - Pay Method: ${currentBook.payMethod}</p>
                <span>
                    <ul>
                        <c:forEach var="edition" items="${currentBook.typeEdition}">
                            <li>${edition}</li>
                        </c:forEach>
                    </ul>
                </span>
            </div>
        </div>
    </div>
</t:wrapper>




