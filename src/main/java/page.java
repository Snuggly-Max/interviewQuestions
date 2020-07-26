public class page {
    Integer rowsPerPage;
    Integer currentPage;

    public page(Integer rowsPerPage, Integer currentPage) {
        this.rowsPerPage = rowsPerPage;
        this.currentPage = currentPage;
    }

    public Integer getRowsPerPage() {
        return rowsPerPage;
    }

    public void setRowsPerPage(Integer rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
