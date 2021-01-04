<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:wrapper>

    <form:form action="processForm" modelAttribute="currentBook">

        <div class="container">
        <div class="row">
            <div class="col-md-6 offset-3 text-white">
                <div class="mb-3">
                    <label for="title" class="form-label">Title</label>
                    <form:input path="title"  cssClass="form-control" placeholder="Title"  cssErrorClass="form-control is-invalid " />
                    <form:errors path="title" cssClass="is-invalid invalid-feedback"/>
                </div>
                <div class="mb-3">
                    <label for="isbn" class="form-label">ISBN</label>
                    <form:input path="isbn" cssClass="form-control" placeholder="ISBN"  cssErrorClass="form-control is-invalid " />
                    <form:errors path="isbn" cssClass="is-invalid invalid-feedback"/>
                </div>
                <div class="mb-3">
                    <label for="author" class="form-label">Author</label>
                    <form:input path="author" cssClass="form-control"  placeholder="Author"  cssErrorClass="form-control is-invalid " />
                    <form:errors path="author" cssClass="is-invalid invalid-feedback"/>
                </div>
                <div class="mb-3">
                    <label for="quantity" class="form-label">Quantity</label>
                    <form:input path="quantity" cssClass="form-control"  placeholder="quantity"  cssErrorClass="form-control is-invalid " />
                    <form:errors path="quantity" cssClass="is-invalid invalid-feedback"/>
                </div>
                <div class="mb-3">
                    <label for="language" class="form-label">Language</label>
                    <form:select path="language" cssClass="form-control" cssErrorClass="form-control is-invalid " >
                        <form:option value="" label="Select" />
                        <form:options items="${currentBook.languages}"></form:options>
                    </form:select>
                    <form:errors path="language" cssClass="is-invalid invalid-feedback"/>
                </div>
                <div class="mb-3">
                    <form:radiobuttons path="payMethod" items="${currentBook.payMethods}" cssClass="ml-1 mr-2" cssErrorClass="form-control is-invalid" />
                    <form:errors path="payMethod" cssClass="is-invalid invalid-feedback"/>
                </div>
                <div class="mb-3">
                    <form:checkboxes path="typeEdition" items="${currentBook.editions}" cssClass="ml-1 mr-2"  cssErrorClass="form-control is-invalid" />
                    <form:errors path="typeEdition" cssClass="is-invalid invalid-feedback"/>
                </div>
                <div class="mb-3">
                    <input type="submit" class="btn btn-primary mx-auto btn-block"  value="SAVE" />
                </div>
            </div>
        </div>
    </form:form>

</t:wrapper>

