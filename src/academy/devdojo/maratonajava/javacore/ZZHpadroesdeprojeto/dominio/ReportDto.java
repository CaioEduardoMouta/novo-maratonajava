package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class ReportDto {
    private String aircraftName;
    private Country country;
    private Currency currency;
    private String PersonName;


    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String PersonName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(Pessoa pessoa) {
            this.PersonName  = PersonName;
            return this;
        }


        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.aircraftName = this.aircraftName;
            reportDto.country = this.country;
            reportDto.PersonName = this.PersonName;
            reportDto.currency = this.currency;
            return reportDto;
        }

        @Override
        public String toString() {
            return "ReportDtoBuilder{" +
                    "aircraftName='" + aircraftName + '\'' +
                    ", country=" + country +
                    ", currency=" + currency +
                    ", personName='" + PersonName + '\'' +
                    '}';
        }


    }

}

