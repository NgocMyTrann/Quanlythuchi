namespace ThuChi.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("ThuChiCSDL")]
    public partial class ThuChiCSDL
    {
        public long ID { get; set; }

        [Required]
        [StringLength(250)]
        public string Ten { get; set; }

        public decimal Sotien { get; set; }

        [Column(TypeName = "date")]
        public DateTime Ngay { get; set; }
    }
}
